package composite;

public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    //显示目录条目一览
    public void printList() {
        printList("");
    }

    //为一览加上前缀，显示目录条目一览
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }
}
