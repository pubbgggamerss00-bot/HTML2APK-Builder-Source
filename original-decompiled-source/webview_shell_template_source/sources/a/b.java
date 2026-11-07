package a;

import a.a;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsService;
import p.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: a.b$b, reason: collision with other inner class name */
    public static class C0003b {
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

    boolean G(a.a aVar, Uri uri);

    boolean L1(a.a aVar, Uri uri, Bundle bundle);

    boolean b2();

    boolean u0(p.c cVar);

    int y1(a.a aVar, String str, Bundle bundle);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends Binder implements b {
        public static final /* synthetic */ int s = 0;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: a.b$a$a, reason: collision with other inner class name */
        public static class C0002a implements b {
            public IBinder s;

            @Override // a.b
            public final boolean G(a.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1b);
                    parcelObtain.writeStrongInterface(aVar);
                    C0003b.b(parcelObtain, uri, 0);
                    this.s.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.b
            public final boolean L1(a.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1b);
                    parcelObtain.writeStrongInterface(aVar);
                    C0003b.b(parcelObtain, uri, 0);
                    C0003b.b(parcelObtain, bundle, 0);
                    this.s.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.s;
            }

            @Override // a.b
            public final boolean b2() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1b);
                    parcelObtain.writeLong(0L);
                    this.s.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.b
            public final boolean u0(p.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1b);
                    parcelObtain.writeStrongInterface(cVar);
                    this.s.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.b
            public final int y1(a.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1b);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0003b.b(parcelObtain, bundle, 0);
                    this.s.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            IInterface iInterfaceQueryLocalInterface;
            String str = b.f1b;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i6) {
                case 2:
                    parcel.readLong();
                    boolean zI = CustomTabsService.this.i();
                    parcel2.writeNoException();
                    parcel2.writeInt(zI ? 1 : 0);
                    return true;
                case 3:
                    boolean zR = ((CustomTabsService.a) this).r(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                case 4:
                    a.a aVarN = a.AbstractBinderC0000a.n(parcel.readStrongBinder());
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) C0003b.a(parcel, creator);
                    parcel.createTypedArrayList(creator);
                    new i(aVarN, CustomTabsService.a.n(bundle));
                    boolean zB = CustomTabsService.this.b();
                    parcel2.writeNoException();
                    parcel2.writeInt(zB ? 1 : 0);
                    return true;
                case 5:
                    parcel.readString();
                    Bundle bundleA = CustomTabsService.this.a();
                    parcel2.writeNoException();
                    C0003b.b(parcel2, bundleA, 1);
                    return true;
                case 6:
                    new i(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), CustomTabsService.a.n((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                    boolean zG = CustomTabsService.this.g();
                    parcel2.writeNoException();
                    parcel2.writeInt(zG ? 1 : 0);
                    return true;
                case 7:
                    boolean zG2 = ((CustomTabsService.a) this).G(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), (Uri) C0003b.a(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG2 ? 1 : 0);
                    return true;
                case 8:
                    int iY1 = ((CustomTabsService.a) this).y1(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0003b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iY1);
                    return true;
                case 9:
                    a.a aVarN2 = a.AbstractBinderC0000a.n(parcel.readStrongBinder());
                    parcel.readInt();
                    new i(aVarN2, CustomTabsService.a.n((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                    boolean zH = CustomTabsService.this.h();
                    parcel2.writeNoException();
                    parcel2.writeInt(zH ? 1 : 0);
                    return true;
                case 10:
                    boolean zR2 = ((CustomTabsService.a) this).r(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), CustomTabsService.a.n((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR2 ? 1 : 0);
                    return true;
                case 11:
                    boolean zL1 = ((CustomTabsService.a) this).L1(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), (Uri) C0003b.a(parcel, Uri.CREATOR), (Bundle) C0003b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zL1 ? 1 : 0);
                    return true;
                case 12:
                    a.a aVarN3 = a.AbstractBinderC0000a.n(parcel.readStrongBinder());
                    parcel.readInt();
                    new i(aVarN3, CustomTabsService.a.n((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                    boolean zE = CustomTabsService.this.e();
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    return true;
                case 13:
                    new i(a.AbstractBinderC0000a.n(parcel.readStrongBinder()), CustomTabsService.a.n((Bundle) C0003b.a(parcel, Bundle.CREATOR)));
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 14:
                    a.a aVarN4 = a.AbstractBinderC0000a.n(parcel.readStrongBinder());
                    IBinder strongBinder = parcel.readStrongBinder();
                    Bundle bundle2 = (Bundle) C0003b.a(parcel, Bundle.CREATOR);
                    if (strongBinder != null && (iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(c.f2c)) != null && (iInterfaceQueryLocalInterface instanceof c)) {
                    }
                    new i(aVarN4, CustomTabsService.a.n(bundle2));
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
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
