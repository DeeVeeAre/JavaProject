package javaproject;

public class SingleClubMember extends Member {

    private int club;

    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);
        club = pClub;
    }

    public void setClub(int pClub) { club = pClub; }
    public int getClub() { return club; }

    @Override
    public String toString() {

        char[] memberType = {getMemberType()};
        int[] memberID = {getMemberID()};
        String[] name = {getName()};
        double[] fees = {getFees()};

        super.toString();

        int[] club = {getClub()};

        return memberType + ", " + memberID + ", " + name + ", " + fees + ", " + club;

    }


}
