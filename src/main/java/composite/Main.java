package composite;

/**
 * 容器和内容具有一致性，创造出递归结构
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries..");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi",1000));
            binDir.add(new File("latex",2000));
            rootDir.printList();

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanako.add(new File("memo.tex",300));
            tomura.add(new File("game.doc",400));
            tomura.add(new File("junk.mail",500));
            rootDir.printList();
        } catch (FileTreatMentException e) {
            e.printStackTrace();
        }

    }

}
