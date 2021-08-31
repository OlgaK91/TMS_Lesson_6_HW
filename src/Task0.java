public class Task0 {
    public static void main(String[] args) {
        String docNumber = "4444-Fff-5555-ggg-6d6d";
        try {
            if (checkSymbolSequence(docNumber)) {
                System.out.println("Document number contains 'abc' sequence");
            } else {
                throw new ExceptionStringDoesntContainSymbolSequence("Document number doesn't contain 'abc' sequence");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (checkBeginning(docNumber)) {
                System.out.println("Document number starts with '555' sequence");
            } else {
                throw new ExceptionStringDoesntStartWithSymbolSequence("Document number doesn't start with '555' sequence")
                        ;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (checkEnding(docNumber)) {
                System.out.println("Document number ends with '1a2b' sequence");
            } else {
                throw new ExceptionStringDoesntStartWithSymbolSequence("Document number doesn't end with '1a2b' sequence")
                        ;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static Boolean checkSymbolSequence(String docNumber) {
        return docNumber.toLowerCase().contains("abc");

    }

    public static Boolean checkBeginning(String docNumber) {
        return docNumber.startsWith("555");
    }

    public static boolean checkEnding(String docNumber) {
        return docNumber.endsWith("1a2b");
    }

}
