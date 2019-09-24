String[] names = new String[3];
        int[] grades = new int[3];

        for (int i = 0; i < 3; i++) {
            Scanner objname = new Scanner(System.in);
            System.out.println("Name:");
            names[i] = objname.next();
            Scanner objgrd = new Scanner(System.in);
            System.out.println("Grade");
            grades[i] = objgrd.nextInt();
        }

        System.out.println("Name         Grade");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + "           " + grades[i]);
        }
