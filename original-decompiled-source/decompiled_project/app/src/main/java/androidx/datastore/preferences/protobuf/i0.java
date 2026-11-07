package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile MessageLite f2036a;

    /* renamed from: b, reason: collision with root package name */
    public volatile j f2037b;

    public final MessageLite a(MessageLite messageLite) {
        if (this.f2036a == null) {
            synchronized (this) {
                if (this.f2036a == null) {
                    try {
                        this.f2036a = messageLite;
                        this.f2037b = j.f2038b;
                    } catch (e0 unused) {
                        this.f2036a = messageLite;
                        this.f2037b = j.f2038b;
                    }
                }
            }
        }
        return this.f2036a;
    }
}
