package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import cf.l;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a {
    public a(cf.d dVar) {
        super(l.f5491m, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean p(String str) {
        String str2;
        cf.a aVar = (cf.a) k().v0(l.f5518t);
        if (aVar != null) {
            ArrayList arrayList = aVar.f5416b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 < arrayList.size()) {
                    Object obj = arrayList.get(i10);
                    str2 = obj instanceof l ? ((l) obj).f5545b : null;
                }
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public jf.g m() {
        cf.a aVar = (cf.a) k().v0(l.f5533x);
        if (aVar != null) {
            return new jf.g(aVar);
        }
        return null;
    }

    public String n() {
        return k().J0(l.f5509q2);
    }

    public String o() {
        return k().J0(l.f5532w2);
    }

    public boolean q() {
        return p("Bottom");
    }

    public boolean r() {
        return p("Left");
    }

    public boolean s() {
        return p("Right");
    }

    public boolean t() {
        return p("Top");
    }
}
