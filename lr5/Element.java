package lr5;

public class Element {
	private int x = 0;
    private int y = 0;

    public Element(int x1, int y1){ x = x1; y = y1; }

    int getX(){ return x; }
    int getY(){ return y; }

    void setX(int x1) { x = x1; }
    void setY(int x1) { y = x1; }

    public int hashCode() {
        int result = 0;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
   }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Element o = (Element) obj;
        if (x != o.x)
            return false;
        if (y != o.y)
            return false;
        return true;
    }
}
