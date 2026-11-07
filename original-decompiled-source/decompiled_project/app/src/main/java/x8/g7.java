package x8;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {850, 861}, m = "importZip")
/* loaded from: classes.dex */
public final class g7 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public j6 f32686a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32687b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f32688c;

    /* renamed from: d, reason: collision with root package name */
    public List f32689d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f32690e;

    /* renamed from: f, reason: collision with root package name */
    public List f32691f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j6 f32693h;

    /* renamed from: j, reason: collision with root package name */
    public int f32694j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(j6 j6Var, vg.c cVar) {
        super(cVar);
        this.f32693h = j6Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32692g = obj;
        this.f32694j |= PKIFailureInfo.systemUnavail;
        return j6.j(this.f32693h, null, null, this);
    }
}
