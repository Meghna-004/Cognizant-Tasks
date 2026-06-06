public class InterfaceDemo_19 {
    interface Playable {
        void play();
    }
    static class Guitar implements Playable {
        public void play() { System.out.println("Strumming the guitar 🎸"); }
    }
    static class Piano implements Playable {
        public void play() { System.out.println("Playing the piano 🎹"); }
    }
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}
