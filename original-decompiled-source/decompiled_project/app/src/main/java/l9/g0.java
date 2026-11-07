package l9;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import l9.f0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "com.basitce.htmltoapk.util.ProjectFolderImporter", f = "ProjectFolderImporter.kt", l = {EACTags.DATE_OF_BIRTH, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, EACTags.DISPLAY_IMAGE, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 72, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "import")
/* loaded from: classes.dex */
public final class g0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f16821a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f16822b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16823c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16824d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16825e;

    /* renamed from: f, reason: collision with root package name */
    public File f16826f;

    /* renamed from: g, reason: collision with root package name */
    public String f16827g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f16828h;

    /* renamed from: j, reason: collision with root package name */
    public f0.a f16829j;

    /* renamed from: k, reason: collision with root package name */
    public int f16830k;

    /* renamed from: l, reason: collision with root package name */
    public int f16831l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16832m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0 f16833n;

    /* renamed from: p, reason: collision with root package name */
    public int f16834p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, vg.c cVar) {
        super(cVar);
        this.f16833n = f0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f16832m = obj;
        this.f16834p |= PKIFailureInfo.systemUnavail;
        return this.f16833n.b(null, null, null, this);
    }
}
