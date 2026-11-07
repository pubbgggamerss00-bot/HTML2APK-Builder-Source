package x8;

import android.content.Context;
import java.io.File;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {1078, 1094}, m = "importKeystoreFromExport")
/* loaded from: classes.dex */
public final class c7 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public j6 f32445a;

    /* renamed from: b, reason: collision with root package name */
    public Context f32446b;

    /* renamed from: c, reason: collision with root package name */
    public String f32447c;

    /* renamed from: d, reason: collision with root package name */
    public String f32448d;

    /* renamed from: e, reason: collision with root package name */
    public String f32449e;

    /* renamed from: f, reason: collision with root package name */
    public String f32450f;

    /* renamed from: g, reason: collision with root package name */
    public File f32451g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f32452h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j6 f32453j;

    /* renamed from: k, reason: collision with root package name */
    public int f32454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(j6 j6Var, vg.c cVar) {
        super(cVar);
        this.f32453j = j6Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32452h = obj;
        this.f32454k |= PKIFailureInfo.systemUnavail;
        return this.f32453j.G(null, null, null, this);
    }
}
