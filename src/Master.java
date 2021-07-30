


class Master {
    public static void main(String[] args) {
        System.out.println("Started program.");


        Brain brain = new Brain();


        Gui gui = new Gui(brain);
        gui.start();


        
        System.out.println("Ended program.");

    }
}




