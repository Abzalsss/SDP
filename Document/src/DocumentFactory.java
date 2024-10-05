
public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void generateDocument(String name) {
        Document doc = createDocument();
        doc.create(name);
    }
}
