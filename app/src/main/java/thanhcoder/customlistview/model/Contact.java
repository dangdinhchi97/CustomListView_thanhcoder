package thanhcoder.customlistview.model;

public class Contact {
    private int  mColor;
    private String mHoten;
    private String mNumber;

    public Contact(int mColor, String mHoten, String mNumber) {
        this.mColor = mColor;
        this.mHoten = mHoten;
        this.mNumber = mNumber;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmHoten() {
        return mHoten;
    }

    public void setmHoten(String mHoten) {
        this.mHoten = mHoten;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
