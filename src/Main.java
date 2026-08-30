//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    House house = new House.Builder("дерево", "Двускатная", 45)

            .color("Жёлтый")
            .build();

    System.out.println(house);

}

