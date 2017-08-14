package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.nav.RichCommandNavigationItem;
import oracle.adf.view.rich.component.rich.nav.RichNavigationPane;

public class Users {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichRegion r1;
    private RichNavigationPane np1;
    private RichCommandNavigationItem ni1;
    private RichCommandNavigationItem ni2;
    private RichCommandNavigationItem ni3;

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }

    public void setNp1(RichNavigationPane np1) {
        this.np1 = np1;
    }

    public RichNavigationPane getNp1() {
        return np1;
    }

    public void setNi1(RichCommandNavigationItem ni1) {
        this.ni1 = ni1;
    }

    public RichCommandNavigationItem getNi1() {
        return ni1;
    }

    public void setNi2(RichCommandNavigationItem ni2) {
        this.ni2 = ni2;
    }

    public RichCommandNavigationItem getNi2() {
        return ni2;
    }

    public void setNi3(RichCommandNavigationItem ni3) {
        this.ni3 = ni3;
    }

    public RichCommandNavigationItem getNi3() {
        return ni3;
    }
}
