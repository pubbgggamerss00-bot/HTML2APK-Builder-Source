package h9;

import android.content.Context;
import androidx.room.a;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12815c;

    public /* synthetic */ u0(String str, int i10, Object obj) {
        this.f12813a = i10;
        this.f12815c = obj;
        this.f12814b = str;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12813a) {
            case 0:
                ((eh.l) this.f12815c).invoke(this.f12814b);
                return pg.f0.f21461a;
            case 1:
                h6.b bVarA = ((a.C0039a) this.f12815c).a(this.f12814b);
                h6.a.a("PRAGMA query_only = 1", bVarA);
                return bVarA;
            default:
                y8.v.k((Context) this.f12815c, this.f12814b);
                return pg.f0.f21461a;
        }
    }
}
