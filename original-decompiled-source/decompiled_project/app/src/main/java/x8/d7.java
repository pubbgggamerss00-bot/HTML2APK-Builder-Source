package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel", f = "HomeViewModel.kt", l = {982, 1033, 1042}, m = "importProjectFromDirectory")
/* loaded from: classes.dex */
public final class d7 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f32513a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32514b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32515c;

    /* renamed from: d, reason: collision with root package name */
    public Object f32516d;

    /* renamed from: e, reason: collision with root package name */
    public String f32517e;

    /* renamed from: f, reason: collision with root package name */
    public String f32518f;

    /* renamed from: g, reason: collision with root package name */
    public String f32519g;

    /* renamed from: h, reason: collision with root package name */
    public String f32520h;

    /* renamed from: j, reason: collision with root package name */
    public ProjectEntity f32521j;

    /* renamed from: k, reason: collision with root package name */
    public long f32522k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f32523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j6 f32524m;

    /* renamed from: n, reason: collision with root package name */
    public int f32525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(j6 j6Var, vg.c cVar) {
        super(cVar);
        this.f32524m = j6Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32523l = obj;
        this.f32525n |= PKIFailureInfo.systemUnavail;
        return this.f32524m.H(null, null, this);
    }
}
