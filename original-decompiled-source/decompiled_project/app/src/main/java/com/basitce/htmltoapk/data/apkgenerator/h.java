package com.basitce.htmltoapk.data.apkgenerator;

import eh.l;
import java.io.File;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5670a;

    public /* synthetic */ h(int i10) {
        this.f5670a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5670a) {
            case 0:
                return Boolean.valueOf(ProjectAssetWriter.writeProjectAssets$lambda$20((File) obj));
            default:
                String it = (String) obj;
                r.e(it, "it");
                return f0.f21461a;
        }
    }
}
