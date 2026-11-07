package com.basitce.htmltoapk.data.apkgenerator.signer;

import eh.l;
import java.io.File;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5675a;

    public /* synthetic */ e(int i10) {
        this.f5675a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5675a) {
            case 0:
                return KeystoreStorage.findUsingLegacyPublicDir$lambda$33((File) obj);
            case 1:
                ((Boolean) obj).booleanValue();
                return f0.f21461a;
            default:
                return new p1.c(0L);
        }
    }
}
