package i5;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g extends c implements kotlin.jvm.internal.g<Object> {

    /* renamed from: v, reason: collision with root package name */
    public final int f13380v;

    public g(g5.d dVar) {
        super(dVar);
        this.f13380v = 2;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f13380v;
    }

    @Override // i5.a
    public final String toString() {
        if (this.s != null) {
            return super.toString();
        }
        q.f13553a.getClass();
        String strA = r.a(this);
        j.d("renderLambdaToString(...)", strA);
        return strA;
    }
}
