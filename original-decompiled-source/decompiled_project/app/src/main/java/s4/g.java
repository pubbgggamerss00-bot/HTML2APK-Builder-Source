package s4;

import java.io.Serializable;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class g<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f24233a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f24234b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24235c;

    /* renamed from: d, reason: collision with root package name */
    public int f24236d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24235c = obj;
        this.f24236d |= PKIFailureInfo.systemUnavail;
        return ah.p.a(null, null, this);
    }
}
