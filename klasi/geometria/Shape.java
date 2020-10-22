package klasi.geometria;

/**
 * ეს არის ზოგადი კლასი და განკუთვნილია გეომეტრიული ობიექტებისთვის.
 */
public class Shape {
    // კონტურის ფერი
    private String outlineColor;
    // შიგთავსის ფერი
    private String fillColor;
    // კონტურის სისქე
    private int outlineWidth;

    // ეს ფუნქცია ეკრანზე ხატავს ფიგურას
    public void draw(double x, double y) {
        // TODO დასამთავრებელია

    }

    // ეს ფუნქცია შლის დახატულ ფიგურას
    public void delete() {
        // TODO დასამთავრებელია
    }

    public String getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public int getOutlineWidth() {
        return outlineWidth;
    }

    public void setOutlineWidth(int outlineWidth) {
        this.outlineWidth = outlineWidth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("outlineColor='").append(outlineColor).append('\'');
        sb.append(", fillColor='").append(fillColor).append('\'');
        sb.append(", outlineWidth=").append(outlineWidth);
        sb.append('}');
        return sb.toString();
    }

}
