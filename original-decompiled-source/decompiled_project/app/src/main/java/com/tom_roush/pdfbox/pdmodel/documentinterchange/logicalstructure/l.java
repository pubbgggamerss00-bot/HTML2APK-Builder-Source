package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private List<T> f6924a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f6925b;

    private List<T> c() {
        if (this.f6924a == null) {
            this.f6924a = new ArrayList();
        }
        return this.f6924a;
    }

    private List<Integer> e() {
        if (this.f6925b == null) {
            this.f6925b = new ArrayList();
        }
        return this.f6925b;
    }

    public void a(T t3, int i10) {
        c().add(t3);
        e().add(Integer.valueOf(i10));
    }

    public T b(int i10) {
        return c().get(i10);
    }

    public int d(int i10) {
        return e().get(i10).intValue();
    }

    public void f(T t3, int i10) {
        int iIndexOf = c().indexOf(t3);
        if (iIndexOf > -1) {
            e().set(iIndexOf, Integer.valueOf(i10));
        }
    }

    public int g() {
        return c().size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < c().size(); i10++) {
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append("object=");
            sb.append(c().get(i10));
            sb.append(", revisionNumber=");
            sb.append(d(i10));
        }
        return sb.toString();
    }
}
