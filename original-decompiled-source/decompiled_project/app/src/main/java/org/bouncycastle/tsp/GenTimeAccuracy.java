package org.bouncycastle.tsp;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import j2.y;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.tsp.Accuracy;

/* loaded from: classes3.dex */
public class GenTimeAccuracy {
    private Accuracy accuracy;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i10) {
        String str;
        if (i10 < 10) {
            str = "00";
        } else {
            if (i10 >= 100) {
                return Integer.toString(i10);
            }
            str = d.L0;
        }
        return y.a(i10, str);
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            return aSN1Integer.intValueExact();
        }
        return 0;
    }

    public int getMicros() {
        return getTimeComponent(this.accuracy.getMicros());
    }

    public int getMillis() {
        return getTimeComponent(this.accuracy.getMillis());
    }

    public int getSeconds() {
        return getTimeComponent(this.accuracy.getSeconds());
    }

    public String toString() {
        return getSeconds() + "." + format(getMillis()) + format(getMicros());
    }
}
