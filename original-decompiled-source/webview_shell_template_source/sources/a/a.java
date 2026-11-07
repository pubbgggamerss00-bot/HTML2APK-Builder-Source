package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f0a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i6) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i6);
            }
        }
    }

    void B0(Bundle bundle);

    void O0(int i6, int i7, Bundle bundle);

    void P1(String str, Bundle bundle);

    void R(int i6, int i7, int i8, int i9, int i10, Bundle bundle);

    void W1(Bundle bundle);

    void Y1(int i6, Uri uri, boolean z6, Bundle bundle);

    void f1(String str, Bundle bundle);

    Bundle j0(String str, Bundle bundle);

    void l1(Bundle bundle);

    void y0(Bundle bundle);

    void z0(Bundle bundle, int i6);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        public static class C0001a implements a {
            public IBinder s;

            @Override // a.a
            public final void B0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void O0(int i6, int i7, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeInt(i7);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void P1(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void R(int i6, int i7, int i8, int i9, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeInt(i8);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void W1(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void Y1(int i6, Uri uri, boolean z6, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeInt(i6);
                    b.b(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.s;
            }

            @Override // a.a
            public final void f1(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final Bundle j0(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.a(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void l1(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void y0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // a.a
            public final void z0(Bundle bundle, int i6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f0a);
                    parcelObtain.writeInt(i6);
                    b.b(parcelObtain, bundle, 0);
                    this.s.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f0a);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C0001a c0001a = new C0001a();
            c0001a.s = iBinder;
            return c0001a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            String str = a.f0a;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i6) {
                case 2:
                    ((p.c) this).z0((Bundle) b.a(parcel, Bundle.CREATOR), parcel.readInt());
                    return true;
                case 3:
                    ((p.c) this).f1(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    ((p.c) this).W1((Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    ((p.c) this).P1(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ((p.c) this).Y1(parcel.readInt(), (Uri) b.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleJ0 = ((p.c) this).j0(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.b(parcel2, bundleJ0, 1);
                    return true;
                case 8:
                    ((p.c) this).O0(parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    ((p.c) this).l1((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    ((p.c) this).R(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    ((p.c) this).y0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    ((p.c) this).B0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i7);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
