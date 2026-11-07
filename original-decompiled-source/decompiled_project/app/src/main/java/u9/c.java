package u9;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f29645a;

    /* renamed from: b, reason: collision with root package name */
    public final a f29646b;

    public enum a implements yd.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f29655a;

        a(int i10) {
            this.f29655a = i10;
        }

        @Override // yd.c
        public final int getNumber() {
            return this.f29655a;
        }
    }

    public c(long j10, a aVar) {
        this.f29645a = j10;
        this.f29646b = aVar;
    }
}
