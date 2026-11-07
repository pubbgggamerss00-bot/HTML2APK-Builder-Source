package x5;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f15165a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f15166b;

    /* renamed from: c, reason: collision with root package name */
    public a f15167c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends e5.c<String> {
        public a() {
        }

        @Override // e5.a
        public final int c() {
            return d.this.f15165a.groupCount() + 1;
        }

        @Override // e5.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i6) {
            String strGroup = d.this.f15165a.group(i6);
            return strGroup == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strGroup;
        }

        @Override // e5.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // e5.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public d(Matcher matcher, CharSequence charSequence) {
        kotlin.jvm.internal.j.e("input", charSequence);
        this.f15165a = matcher;
        this.f15166b = charSequence;
    }

    @Override // x5.c
    public final List<String> a() {
        if (this.f15167c == null) {
            this.f15167c = new a();
        }
        a aVar = this.f15167c;
        kotlin.jvm.internal.j.b(aVar);
        return aVar;
    }

    public final u5.c b() {
        Matcher matcher = this.f15165a;
        return u5.d.q(matcher.start(), matcher.end());
    }
}
