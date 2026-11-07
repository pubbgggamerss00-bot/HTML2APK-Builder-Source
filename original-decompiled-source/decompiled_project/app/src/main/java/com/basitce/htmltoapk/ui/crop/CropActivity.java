package com.basitce.htmltoapk.ui.crop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import eh.p;
import kotlin.jvm.internal.r;
import n8.m1;
import pg.f0;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class CropActivity extends r8.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f5745f = 0;

    /* renamed from: e, reason: collision with root package name */
    public m1 f5746e;

    public static final class a {
        public static Intent a(Context context, Uri inputUri, Uri uri) {
            r.e(context, "context");
            r.e(inputUri, "inputUri");
            Intent intentAddFlags = new Intent(context, (Class<?>) CropActivity.class).putExtra("com.yalantis.ucrop.InputUri", inputUri).putExtra("com.yalantis.ucrop.OutputUri", uri).addFlags(1);
            r.d(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }
    }

    public static final class b implements p<x0.j, Integer, f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f5748b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f5749c;

        public b(Uri uri, Uri uri2) {
            this.f5748b = uri;
            this.f5749c = uri2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            sh.f hVar;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                CropActivity cropActivity = CropActivity.this;
                m1 m1Var = cropActivity.f5746e;
                if (m1Var != null) {
                    hVar = m1Var.f18529e;
                } else {
                    k9.a.f16171c.getClass();
                    hVar = new sh.h(k9.a.f16172d);
                }
                k9.a.f16171c.getClass();
                n1 n1VarA = bg.b.a(hVar, k9.a.f16172d, null, jVar2, 48, 2);
                jVar2.L(-1560217099);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = bg.b.h(Boolean.FALSE);
                    jVar2.C(objG);
                }
                n1 n1Var = (n1) objG;
                jVar2.B();
                jVar2.L(-1560214923);
                Object objG2 = jVar2.g();
                if (objG2 == c0321a) {
                    objG2 = bg.b.h(Boolean.FALSE);
                    jVar2.C(objG2);
                }
                n1 n1Var2 = (n1) objG2;
                jVar2.B();
                jVar2.L(-1560212629);
                Object objG3 = jVar2.g();
                if (objG3 == c0321a) {
                    objG3 = bg.b.h(null);
                    jVar2.C(objG3);
                }
                jVar2.B();
                k9.j.a((k9.a) n1VarA.getValue(), false, f1.c.b(-1759698672, new k(cropActivity, n1Var, (n1) objG3, n1Var2, this.f5748b, this.f5749c), jVar2), jVar2, 384);
            }
            return f0.f21461a;
        }
    }

    @Override // r8.e, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9.g.a(this);
        Uri uri = (Uri) getIntent().getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) getIntent().getParcelableExtra("com.yalantis.ucrop.OutputUri");
        if (uri != null && uri2 != null) {
            c.g.a(this, new f1.b(9947506, true, new b(uri, uri2)));
            return;
        }
        Intent intentPutExtra = new Intent().putExtra("com.yalantis.ucrop.Error", new IllegalArgumentException("Missing input or output URI"));
        r.d(intentPutExtra, "putExtra(...)");
        setResult(96, intentPutExtra);
        finish();
    }
}
