package objectsInnerNestedClasses;

public class Outer {
    public String outerPublic = "outerPublic";
    private String outerPrivate = "outerPrivate";
    private static System outerField;

    public Outer(String outerPublic) {
       Inner inner = new Inner();
       inner.methodInnerPublic();
    }

    String str = Nested.nestedFieldNew;

    public void methodOuterPublic() {
    }

    private void methodOuterPrivate() {
    }

    public class Inner {
        public String innerPublic = "innerPublic";
        private String innerPrivate = "innerPrivate";

        public void methodInnerPublic() {
            System.out.println(outerPublic);
            System.out.println(outerPrivate);

        }

        private void methodInnerPrivate() {
        }
    }


    public static class Nested {
        public String nestedPublic = "innerPublic";
        private String nestedPrivate = "innerPrivate";
        static String nestedFieldNew = "New";

        public void methodNestedPublic() {
           // System.out.println(outerPublic);
            //System.out.println(outerPrivate);
            System.out.println(outerField);


        }
    }
}

