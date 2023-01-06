public class Student {
    public class student {
        public String name;
        public int age;
        public String group;

        public static void main(String[] args) {
            Student somsri = new Student();
            /*
             * somsri.name = "Somsri422R";
             * somsri.age = 15;
             * somsri.group = "65/45";
             */
            somsri.setData("Somsri", 15, "65/45");
            somsri.getData();
            // somsri.printName();
            // somsri.printAge();
            // somsri.printGroup();
            System.out.println("------------");
            somsri.setData("Somsak", 25, "66/45");
            somsri.getData();
            // somsri.printName();
            // somsri.printAge();
            // somsri.printGroup();
        }

        public void setData(String name, int age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        public void getData() {
            System.out.println(this.name + " is " + this.age + " years old and is in group " + this.group);
        }

        public void printName() {
            System.out.println("Student name:\t" + this.name);
        }

        public void printAge() {
            System.out.println("Student age:\t" + this.age);
        }

        public void printGroup() {
            System.out.println("Student group:\t" + this.group);
        }
    }

}
