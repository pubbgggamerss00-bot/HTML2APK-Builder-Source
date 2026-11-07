package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jt implements yt {
    public final /* synthetic */ int s;

    public /* synthetic */ jt(int i6) {
        this.s = i6;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        switch (this.s) {
            case 0:
                xa0 xa0Var = (xa0) obj;
                String str = (String) map.get("action");
                if (!"tick".equals(str)) {
                    if (!"experiment".equals(str)) {
                        if ("extra".equals(str)) {
                            String str2 = (String) map.get("name");
                            String str3 = (String) map.get("value");
                            if (!TextUtils.isEmpty(str3)) {
                                if (!TextUtils.isEmpty(str2)) {
                                    ((oo) xa0Var.zzm().f6799u).b(str2, str3);
                                    break;
                                } else {
                                    zzo.zzj("No name given for CSI extra.");
                                    break;
                                }
                            } else {
                                zzo.zzj("No value given for CSI extra.");
                                break;
                            }
                        }
                    } else {
                        String str4 = (String) map.get("value");
                        if (!TextUtils.isEmpty(str4)) {
                            ((oo) xa0Var.zzm().f6799u).b("e", str4);
                            break;
                        } else {
                            zzo.zzj("No value given for CSI experiment.");
                            break;
                        }
                    }
                } else {
                    String str5 = (String) map.get("label");
                    String str6 = (String) map.get("start_label");
                    String str7 = (String) map.get("timestamp");
                    if (TextUtils.isEmpty(str5)) {
                        zzo.zzj("No label given for CSI tick.");
                        break;
                    } else if (TextUtils.isEmpty(str7)) {
                        zzo.zzj("No timestamp given for CSI tick.");
                        break;
                    } else {
                        try {
                            long j6 = (Long.parseLong(str7) - zzv.zzC().a()) + zzv.zzC().b();
                            if (true == TextUtils.isEmpty(str6)) {
                                str6 = "native:view_load";
                            }
                            lo loVarZzm = xa0Var.zzm();
                            HashMap map2 = (HashMap) loVarZzm.f6798t;
                            ko koVar = (ko) map2.get(str6);
                            String[] strArr = {str5};
                            if (koVar != null) {
                                ((oo) loVarZzm.f6799u).c(koVar, j6, strArr);
                            }
                            map2.put(str5, new ko(j6, null, null));
                            break;
                        } catch (NumberFormatException e6) {
                            zzo.zzk("Malformed timestamp for CSI tick.", e6);
                            return;
                        }
                    }
                }
                break;
            case 1:
                wb0 wb0Var = (wb0) obj;
                mt mtVar = xt.f10667a;
                String str8 = (String) map.get("tx");
                String str9 = (String) map.get("ty");
                String str10 = (String) map.get("td");
                try {
                    int i6 = Integer.parseInt(str8);
                    int i7 = Integer.parseInt(str9);
                    int i8 = Integer.parseInt(str10);
                    mf mfVarB = wb0Var.b();
                    if (mfVarB != null) {
                        mfVarB.f7110b.zzl(i6, i7, i8);
                        break;
                    }
                } catch (NumberFormatException unused) {
                    zzo.zzj("Could not parse touch parameters from gmsg.");
                    return;
                }
                break;
            case 2:
                xa0 xa0Var2 = (xa0) obj;
                zzv.zzk().zza(xa0Var2, xa0Var2.getContext());
                break;
            default:
                xa0 xa0Var3 = (xa0) obj;
                if (map.keySet().contains("start")) {
                    xa0Var3.g0(true);
                }
                if (map.keySet().contains("stop")) {
                    xa0Var3.g0(false);
                    break;
                }
                break;
        }
    }
}
