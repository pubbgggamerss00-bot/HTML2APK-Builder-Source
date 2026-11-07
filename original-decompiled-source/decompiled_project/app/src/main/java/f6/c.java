package f6;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import bi.f;
import java.io.Serializable;
import kotlin.jvm.internal.h0;
import kotlinx.serialization.PolymorphicSerializer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8850a = new PolymorphicSerializer(h0.a(CharSequence.class)).getDescriptor();

    /* renamed from: b, reason: collision with root package name */
    public static final f f8851b = new PolymorphicSerializer(h0.a(Parcelable.class)).getDescriptor();

    /* renamed from: c, reason: collision with root package name */
    public static final f f8852c = new PolymorphicSerializer(h0.a(Serializable.class)).getDescriptor();

    /* renamed from: d, reason: collision with root package name */
    public static final f f8853d = new PolymorphicSerializer(h0.a(IBinder.class)).getDescriptor();

    /* renamed from: e, reason: collision with root package name */
    public static final f f8854e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f8855f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f8856g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f8857h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f8858i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f8859j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f8860k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f8861l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f8862m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f8863n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f8864o;

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        f8854e = ai.a.a(h0.a(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        f8855f = ai.a.a(h0.a(Parcelable.class), new PolymorphicSerializer(h0.a(Parcelable.class))).getDescriptor();
        f8856g = ai.a.b(defaultParcelableSerializer).getDescriptor();
        f8857h = ai.a.b(new PolymorphicSerializer(h0.a(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        f8858i = ai.a.a(h0.a(CharSequence.class), charSequenceSerializer).getDescriptor();
        f8859j = ai.a.a(h0.a(CharSequence.class), new PolymorphicSerializer(h0.a(CharSequence.class))).getDescriptor();
        f8860k = ai.a.b(charSequenceSerializer).getDescriptor();
        f8861l = ai.a.b(new PolymorphicSerializer(h0.a(CharSequence.class))).getDescriptor();
        f8862m = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        f8863n = new SparseArraySerializer(new PolymorphicSerializer(h0.a(Parcelable.class))).getDescriptor();
        f8864o = new SparseArraySerializer(ai.a.d(new PolymorphicSerializer(h0.a(Parcelable.class)))).getDescriptor();
    }
}
