package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public String f11702a;

    /* renamed from: b, reason: collision with root package name */
    public String f11703b;

    /* renamed from: c, reason: collision with root package name */
    public String f11704c;

    /* renamed from: d, reason: collision with root package name */
    public List f11705d;

    /* renamed from: e, reason: collision with root package name */
    public List f11706e;

    /* renamed from: f, reason: collision with root package name */
    public String f11707f;

    /* renamed from: g, reason: collision with root package name */
    public int f11708g;
    public int h;

    public static e0 a(JsonReader jsonReader) throws IOException {
        int i6;
        e0 e0Var = new e0();
        e0Var.f11708g = 1;
        List list = Collections.EMPTY_LIST;
        e0Var.f11705d = list;
        e0Var.f11706e = list;
        e0Var.h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i7 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 5;
                                e0Var.f11708g = i7;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 7;
                                e0Var.f11708g = i7;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 1;
                                e0Var.f11708g = i7;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                e0Var.f11708g = i7;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 8;
                                e0Var.f11708g = i7;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 4;
                                e0Var.f11708g = i7;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 2;
                                e0Var.f11708g = i7;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i7 = 6;
                                e0Var.f11708g = i7;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        e0Var.f11704c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        e0Var.f11703b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (strNextName.equals("client_side_pingback_url")) {
                        e0Var.f11707f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            e0Var.h = i7;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i7 = 1;
                            e0Var.h = i7;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i7 = 2;
                            e0Var.h = i7;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals("actions")) {
                        e0Var.f11706e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            d0 d0Var = new d0();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i6 = 1;
                                                d0Var.f11680b = i6;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i6 = 2;
                                                d0Var.f11680b = i6;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            }
                                            i6 = 3;
                                            d0Var.f11680b = i6;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    d0Var.f11679a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            e0Var.f11706e.add(d0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        e0Var.f11705d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            e0Var.f11705d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        e0Var.f11702a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return e0Var;
    }
}
