package Introduction.day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbrevation();
        System.out.println(abbreviationOfFlorida);

     UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state);

        String stateName = UsStatesEnum.getStateNameByUsingAbbrevation("AK");
        System.out.println(stateName);

        String abbreviationofAlaska =UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationofAlaska);

    }


}
