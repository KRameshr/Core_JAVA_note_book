import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibFunctions {

    // Call menu to issue a book
    public static void callIssueMenu() {
        System.out.println("Reached inside issue book menu");
        Member m = new Member();
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter the member id: ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the isbn code: ");
                b.setIsbnCode(sc.nextLine());
                issueBook(m, b);
                addStatus = 1;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                addStatus = 0;
            }
        }
    }

    // Issue book for a member
    public static void issueBook(Member m, Book b) {
        Connection conn = LibUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;

            // Check if the book is already issued to the member
            String qry = "SELECT mbr.rec_id " +
                         "FROM members m, books b, member_book_record mbr " +
                         "WHERE m.member_id = " + m.getMemberId() + " " +
                         "AND b.isbn_code = '" + b.getIsbnCode() + "' " +
                         "AND m.member_id = mbr.member_id " +
                         "AND b.isbn_code = mbr.isbn_code " +
                         "AND mbr.dor IS NULL";

            rs = stmt.executeQuery(qry);

            if (rs.next()) {
                System.out.println("The book is already issued and cannot be issued again");
            } else {
                // Insert a new record for issue
                int k = stmt.executeUpdate(
                    "INSERT INTO member_book_record(member_id, isbn_code, doi, dor) " +
                    "VALUES (" + m.getMemberId() + ", '" + b.getIsbnCode() + "', GETDATE(), NULL)"
                );

                if (k > 0) {
                    // Reduce units available
                    stmt.executeUpdate(
                        "UPDATE books SET units_available = units_available - 1 " +
                        "WHERE isbn_code = '" + b.getIsbnCode() + "'"
                    );
                    conn.commit();
                    System.out.println("The book is issued successfully");
                } else {
                    conn.rollback();
                    System.out.println("Failed to issue the book");
                }
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Call menu to return a book
    public static void callReturnMenu() {
        System.out.println("Reached inside return book menu");
        Member m = new Member();
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter the member id: ");
                m.setMemberId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the isbn code: ");
                b.setIsbnCode(sc.nextLine());
                returnBook(m, b);
                addStatus = 1;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                addStatus = 0;
            }
        }
    }

    // Return a book
    public static void returnBook(Member m, Book b) {
        Connection conn = LibUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;

            // Check if the book is issued and not yet returned
            String qry = "SELECT mbr.rec_id " +
                         "FROM members m, books b, member_book_record mbr " +
                         "WHERE m.member_id = " + m.getMemberId() + " " +
                         "AND b.isbn_code = '" + b.getIsbnCode() + "' " +
                         "AND m.member_id = mbr.member_id " +
                         "AND b.isbn_code = mbr.isbn_code " +
                         "AND mbr.dor IS NULL";

            rs = stmt.executeQuery(qry);

            if (rs.next()) {
                Integer recId = rs.getInt("rec_id");
                System.out.println("The book is already issued and starting the process to return");

                // Update dor to mark the book returned
                int k = stmt.executeUpdate(
                    "UPDATE member_book_record SET dor = GETDATE() WHERE rec_id = " + recId
                );

                if (k > 0) {
                    // Increase units available
                    stmt.executeUpdate(
                        "UPDATE books SET units_available = units_available + 1 " +
                        "WHERE isbn_code = '" + b.getIsbnCode() + "'"
                    );

                    conn.commit();
                    System.out.println("The book is returned successfully");
                } else {
                    conn.rollback();
                    System.out.println("Failed to return the book");
                }

            } else {
                System.out.println("This book is not issued for the user");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

