package b;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import androidx.browser.trusted.TrustedWebActivityService;
import c3.f;
import i0.q;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1857f = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends Binder implements b {
        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            NotificationChannel notificationChannel;
            IInterface iInterfaceQueryLocalInterface;
            String str = b.f1857f;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            Notification notificationBuild = null;
            boolean z6 = false;
            switch (i6) {
                case 2:
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                    TrustedWebActivityService.a aVar = (TrustedWebActivityService.a) this;
                    aVar.n();
                    a1.a.e("android.support.customtabs.trusted.PLATFORM_TAG", bundle);
                    a1.a.e("android.support.customtabs.trusted.PLATFORM_ID", bundle);
                    a1.a.e("android.support.customtabs.trusted.NOTIFICATION", bundle);
                    a1.a.e("android.support.customtabs.trusted.CHANNEL_NAME", bundle);
                    String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                    int i8 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                    Notification notification = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
                    String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                    TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
                    if (trustedWebActivityService.s == null) {
                        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                    }
                    if (new q(trustedWebActivityService).f13338a.areNotificationsEnabled()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            String strA = TrustedWebActivityService.a(string2);
                            NotificationManager notificationManager = trustedWebActivityService.s;
                            notificationManager.createNotificationChannel(f.b(strA, string2));
                            if (notificationManager.getNotificationChannel(strA).getImportance() != 0) {
                                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
                                builderRecoverBuilder.setChannelId(strA);
                                notificationBuild = builderRecoverBuilder.build();
                            }
                            NotificationChannel notificationChannel2 = trustedWebActivityService.s.getNotificationChannel(strA);
                            if (notificationChannel2 == null || notificationChannel2.getImportance() != 0) {
                                notification = notificationBuild;
                                trustedWebActivityService.s.notify(string, i8, notification);
                                z6 = true;
                            }
                        } else {
                            trustedWebActivityService.s.notify(string, i8, notification);
                            z6 = true;
                        }
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z6);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                    TrustedWebActivityService.a aVar2 = (TrustedWebActivityService.a) this;
                    aVar2.n();
                    a1.a.e("android.support.customtabs.trusted.PLATFORM_TAG", bundle3);
                    a1.a.e("android.support.customtabs.trusted.PLATFORM_ID", bundle3);
                    String string3 = bundle3.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                    int i9 = bundle3.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                    NotificationManager notificationManager2 = TrustedWebActivityService.this.s;
                    if (notificationManager2 == null) {
                        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                    }
                    notificationManager2.cancel(string3, i9);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    TrustedWebActivityService.a aVar3 = (TrustedWebActivityService.a) this;
                    aVar3.n();
                    int iC = TrustedWebActivityService.this.c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 5:
                    TrustedWebActivityService.a aVar4 = (TrustedWebActivityService.a) this;
                    aVar4.n();
                    NotificationManager notificationManager3 = TrustedWebActivityService.this.s;
                    if (notificationManager3 == null) {
                        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                    }
                    StatusBarNotification[] activeNotifications = notificationManager3.getActiveNotifications();
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle4.writeToParcel(parcel2, 1);
                    return true;
                case 6:
                    Bundle bundle5 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                    TrustedWebActivityService.a aVar5 = (TrustedWebActivityService.a) this;
                    aVar5.n();
                    a1.a.e("android.support.customtabs.trusted.CHANNEL_NAME", bundle5);
                    String string4 = bundle5.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                    TrustedWebActivityService trustedWebActivityService2 = TrustedWebActivityService.this;
                    if (trustedWebActivityService2.s == null) {
                        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                    }
                    if (new q(trustedWebActivityService2).f13338a.areNotificationsEnabled() && (Build.VERSION.SDK_INT < 26 || (notificationChannel = trustedWebActivityService2.s.getNotificationChannel(TrustedWebActivityService.a(string4))) == null || notificationChannel.getImportance() != 0)) {
                        z6 = true;
                    }
                    Bundle bundle6 = new Bundle();
                    bundle6.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z6);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle6.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    TrustedWebActivityService.a aVar6 = (TrustedWebActivityService.a) this;
                    aVar6.n();
                    TrustedWebActivityService trustedWebActivityService3 = TrustedWebActivityService.this;
                    int iC2 = trustedWebActivityService3.c();
                    Bundle bundle7 = new Bundle();
                    if (iC2 != -1) {
                        bundle7.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService3.getResources(), iC2));
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle7.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i6, parcel, parcel2, i7);
                case 9:
                    parcel.readString();
                    IBinder strongBinder = parcel.readStrongBinder();
                    ((TrustedWebActivityService.a) this).n();
                    if (strongBinder != null && (iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.a.f1856e)) != null && (iInterfaceQueryLocalInterface instanceof b.a)) {
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
