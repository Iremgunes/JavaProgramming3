package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalist BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalist BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID){
        testers.removeIf(p-> p.ID == ID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p-> p.ID == ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }



}
