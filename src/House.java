public class House {

    private final String roof;
    private final String material;
    private final String color;
    private final int area;

    private House (Builder builder) {
        this.roof = builder.roof;
        this.material = builder.material;
        this.color = builder.color;
        this.area = builder.area;

    }
    private String getRoof(){return roof;};
    private final String getMaterial(){return material;};
    private final String getColor(){return color;};
    private final int getArea(){return area;};

    public static class Builder {
        private String roof;
        private String material;
        private String color;
        private int area;

        public Builder(String material, String roof, int area) {
            this.material = material;
            this.roof = roof;
            this.area = area;
        }
        public Builder color(String color) {
            this.color = color;
            return this;  
        }
        public House build (){return new House (this); }

    }
    @Override
    public String toString() {
        return "house{" +
                "roof ='" + roof + '\'' +
                ", material ='" + material + '\'' +
                ", color ='" + color + '\'' +
                ", area =" + area +'}';
    }

}
