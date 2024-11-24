package java102;

class LibraryItem {
    private boolean isCheckedOut;

    public LibraryItem() {
        this.isCheckedOut = false;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnItem() {
        isCheckedOut = false;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public String toString() {
        return "LibraryItem{isCheckedOut=" + isCheckedOut + "}";
    }
}