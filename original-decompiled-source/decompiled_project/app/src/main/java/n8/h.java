package n8;

import com.basitce.htmltoapk.data.local.dao.FolderDao;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.FolderRepository", f = "FolderRepository.kt", l = {18, 18}, m = "createFolder")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public FolderDao f18457a;

    /* renamed from: b, reason: collision with root package name */
    public String f18458b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f18460d;

    /* renamed from: e, reason: collision with root package name */
    public int f18461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vg.c cVar) {
        super(cVar);
        this.f18460d = iVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18459c = obj;
        this.f18461e |= PKIFailureInfo.systemUnavail;
        return this.f18460d.a(null, this);
    }
}
