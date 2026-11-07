package fa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.internal.auth.zzbz;
import j2.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ua.a;

/* loaded from: classes2.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f11134h;

    /* renamed from: a, reason: collision with root package name */
    public final Set f11135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11136b;

    /* renamed from: c, reason: collision with root package name */
    public String f11137c;

    /* renamed from: d, reason: collision with root package name */
    public int f11138d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f11139e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f11140f;

    /* renamed from: g, reason: collision with root package name */
    public final a f11141g;

    static {
        HashMap map = new HashMap();
        f11134h = map;
        map.put("accountType", new a.C0303a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new a.C0303a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new a.C0303a(8, false, 8, false, "transferBytes", 4, null));
    }

    public i() {
        this.f11135a = new p.b(3);
        this.f11136b = 1;
    }

    @Override // ua.a
    public final /* synthetic */ Map getFieldMappings() {
        return f11134h;
    }

    @Override // ua.a
    public final Object getFieldValue(a.C0303a c0303a) {
        int i10 = c0303a.f29669g;
        if (i10 == 1) {
            return Integer.valueOf(this.f11136b);
        }
        if (i10 == 2) {
            return this.f11137c;
        }
        if (i10 == 3) {
            return Integer.valueOf(this.f11138d);
        }
        if (i10 == 4) {
            return this.f11139e;
        }
        throw new IllegalStateException(y.a(c0303a.f29669g, "Unknown SafeParcelable id="));
    }

    @Override // ua.a
    public final boolean isFieldSet(a.C0303a c0303a) {
        return this.f11135a.contains(Integer.valueOf(c0303a.f29669g));
    }

    @Override // ua.a
    public final void setDecodedBytesInternal(a.C0303a c0303a, String str, byte[] bArr) {
        int i10 = c0303a.f29669g;
        if (i10 != 4) {
            throw new IllegalArgumentException(ad.b.b(i10, "Field with id=", " is not known to be a byte array."));
        }
        this.f11139e = bArr;
        this.f11135a.add(Integer.valueOf(i10));
    }

    @Override // ua.a
    public final void setIntegerInternal(a.C0303a c0303a, String str, int i10) {
        int i11 = c0303a.f29669g;
        if (i11 != 3) {
            throw new IllegalArgumentException(ad.b.b(i11, "Field with id=", " is not known to be an int."));
        }
        this.f11138d = i10;
        this.f11135a.add(Integer.valueOf(i11));
    }

    @Override // ua.a
    public final void setStringInternal(a.C0303a c0303a, String str, String str2) {
        int i10 = c0303a.f29669g;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
        }
        this.f11137c = str2;
        this.f11135a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        Set set = this.f11135a;
        if (set.contains(1)) {
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11136b);
        }
        if (set.contains(2)) {
            c1.m(parcel, 2, this.f11137c, true);
        }
        if (set.contains(3)) {
            int i11 = this.f11138d;
            c1.s(parcel, 3, 4);
            parcel.writeInt(i11);
        }
        if (set.contains(4)) {
            c1.f(parcel, 4, this.f11139e, true);
        }
        if (set.contains(5)) {
            c1.l(parcel, 5, this.f11140f, i10, true);
        }
        if (set.contains(6)) {
            c1.l(parcel, 6, this.f11141g, i10, true);
        }
        c1.r(iQ, parcel);
    }

    public i(HashSet hashSet, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f11135a = hashSet;
        this.f11136b = i10;
        this.f11137c = str;
        this.f11138d = i11;
        this.f11139e = bArr;
        this.f11140f = pendingIntent;
        this.f11141g = aVar;
    }
}
