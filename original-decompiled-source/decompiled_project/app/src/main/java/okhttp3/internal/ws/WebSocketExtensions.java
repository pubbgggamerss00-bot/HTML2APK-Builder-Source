package okhttp3.internal.ws;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class WebSocketExtensions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19811a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f19812b = null;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19813c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f19814d = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19815e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19816f = false;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f19811a == webSocketExtensions.f19811a && r.a(this.f19812b, webSocketExtensions.f19812b) && this.f19813c == webSocketExtensions.f19813c && r.a(this.f19814d, webSocketExtensions.f19814d) && this.f19815e == webSocketExtensions.f19815e && this.f19816f == webSocketExtensions.f19816f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f19811a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        Integer num = this.f19812b;
        int iHashCode = (i11 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f19813c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode + i12) * 31;
        Integer num2 = this.f19814d;
        int iHashCode2 = (i13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f19815e;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (iHashCode2 + i14) * 31;
        boolean z13 = this.f19816f;
        return i15 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f19811a + ", clientMaxWindowBits=" + this.f19812b + ", clientNoContextTakeover=" + this.f19813c + ", serverMaxWindowBits=" + this.f19814d + ", serverNoContextTakeover=" + this.f19815e + ", unknownValues=" + this.f19816f + ')';
    }
}
