
public class imteaz3 {
    public static void main(String[] args) {
        Text myText = new Text("I am a DP");
        System.out.println(myText.getDescription());

        BoldText boldText = new BoldText(myText.getText());
        System.out.println(boldText.getDescription());

        BoldItalicText boldItalicText = new BoldItalicText(boldText.getText());
        System.out.println(boldItalicText.getDescription());
        
        ItalicText italicText = new ItalicText(myText.getText());
        System.out.println(italicText.getDescription());
        
        UnderlineText underlineText = new UnderlineText(myText.getText());
        System.out.println(underlineText.getDescription());
    }
}

class Text {
    public String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return text;
    }
}

class ItalicText extends Text {
    public ItalicText(String text) {
        super(text);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", italic";
    }
}

class BoldItalicText extends Text {
    public BoldItalicText(String text) {
        super(text);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold and italic";
    }
}

class BoldText extends Text {
    public BoldText(String text) {
        super(text);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", bold";
    }
}

class UnderlineText extends Text {
    public UnderlineText(String text) {
        super(text);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", underline";
    }
}

