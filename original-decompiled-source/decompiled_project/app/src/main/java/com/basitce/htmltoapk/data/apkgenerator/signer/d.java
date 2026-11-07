package com.basitce.htmltoapk.data.apkgenerator.signer;

import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import java.io.File;
import kotlin.jvm.internal.r;
import pg.f0;
import s.d0;
import s.q0;
import s.w;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5674a;

    public /* synthetic */ d(int i10) {
        this.f5674a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5674a) {
            case 0:
                return Boolean.valueOf(KeystoreStorage.findUsingLegacyPublicDir$lambda$32((File) obj));
            default:
                q0.b keyframes = (q0.b) obj;
                r.e(keyframes, "$this$keyframes");
                keyframes.f23906a = 950;
                q0.a aVarA = keyframes.a(0, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                w wVar = d0.f23703a;
                aVarA.f14648b = wVar;
                keyframes.a(580, Float.valueOf(1.08f)).f14648b = wVar;
                keyframes.a(780, Float.valueOf(0.98f)).f14648b = wVar;
                keyframes.a(950, Float.valueOf(1.0f));
                return f0.f21461a;
        }
    }
}
