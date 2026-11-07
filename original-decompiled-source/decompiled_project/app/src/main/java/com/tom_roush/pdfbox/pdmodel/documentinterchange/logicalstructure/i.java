package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6921b = "StructTreeRoot";

    public i() {
        super(f6921b);
    }

    public void A(Map<String, String> map) {
        cf.d dVar = new cf.d();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            dVar.R0(cf.l.g0(key), entry.getValue());
        }
        Z().O0(cf.l.X1, dVar);
    }

    public jf.e<g> q() {
        cf.b bVarV0 = Z().v0(cf.l.W0);
        if (bVarV0 instanceof cf.d) {
            return new hf.h((cf.d) bVarV0);
        }
        return null;
    }

    public cf.b r() {
        return Z().v0(cf.l.f5470g1);
    }

    @Deprecated
    public cf.a s() {
        cf.d dVarZ = Z();
        cf.l lVar = cf.l.f5470g1;
        cf.b bVarV0 = dVarZ.v0(lVar);
        if (!(bVarV0 instanceof cf.d)) {
            if (bVarV0 instanceof cf.a) {
                return (cf.a) bVarV0;
            }
            return null;
        }
        cf.b bVarV02 = ((cf.d) bVarV0).v0(lVar);
        if (bVarV02 instanceof cf.a) {
            return (cf.a) bVarV02;
        }
        return null;
    }

    public jf.f t() {
        cf.b bVarV0 = Z().v0(cf.l.L1);
        if (bVarV0 instanceof cf.d) {
            return new jf.f((cf.d) bVarV0);
        }
        return null;
    }

    public int u() {
        return Z().G0(cf.l.M1, null, -1);
    }

    public Map<String, Object> v() {
        cf.b bVarV0 = Z().v0(cf.l.X1);
        if (bVarV0 instanceof cf.d) {
            try {
                return jf.b.c((cf.d) bVarV0);
            } catch (IOException e10) {
                Log.e("PdfBox-Android", e10.getMessage(), e10);
            }
        }
        return new HashMap();
    }

    public void w(jf.e<g> eVar) {
        Z().P0(cf.l.W0, eVar);
    }

    public void x(cf.b bVar) {
        Z().O0(cf.l.f5470g1, bVar);
    }

    public void y(jf.f fVar) {
        Z().P0(cf.l.L1, fVar);
    }

    public void z(int i10) {
        Z().N0(cf.l.M1, i10);
    }

    public i(cf.d dVar) {
        super(dVar);
    }
}
