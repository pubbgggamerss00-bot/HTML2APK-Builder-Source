package n8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator", f = "DocumentProjectCreator.kt", l = {117, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, 121, 123}, m = "create")
/* loaded from: classes.dex */
public final class b extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f18375a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18376b;

    /* renamed from: c, reason: collision with root package name */
    public ProjectEntity f18377c;

    /* renamed from: d, reason: collision with root package name */
    public long f18378d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f18379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f18380f;

    /* renamed from: g, reason: collision with root package name */
    public int f18381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, vg.c cVar) {
        super(cVar);
        this.f18380f = gVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18379e = obj;
        this.f18381g |= PKIFailureInfo.systemUnavail;
        return g.a(this.f18380f, null, null, null, null, null, null, this);
    }
}
