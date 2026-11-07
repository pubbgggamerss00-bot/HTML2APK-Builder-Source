package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
    }

    public static List<SurfaceCombination> generateSupportedCombinationList(int i6, boolean z6, boolean z7) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i6 == 0 || i6 == 1 || i6 == 3) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i6 == 1 || i6 == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z6) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z7 && i6 == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (i6 == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    public static List<SurfaceCombination> get10BitSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize, surfaceCombinationA, arrayList, surfaceCombinationA);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationA2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationA3 = v0.a(configType3, configSize, surfaceCombinationA2, arrayList, surfaceCombinationA2);
        g0.b(configType, configSize2, surfaceCombinationA3, configType2, configSize);
        SurfaceCombination surfaceCombinationA4 = y0.a(arrayList, surfaceCombinationA3);
        g0.b(configType2, configSize2, surfaceCombinationA4, configType2, configSize);
        SurfaceCombination surfaceCombinationA5 = y0.a(arrayList, surfaceCombinationA4);
        surfaceCombinationA5.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationA6 = v0.a(configType, configSize3, surfaceCombinationA5, arrayList, surfaceCombinationA5);
        g0.b(configType, configSize2, surfaceCombinationA6, configType, configSize3);
        SurfaceCombination surfaceCombinationA7 = v0.a(configType2, configSize3, surfaceCombinationA6, arrayList, surfaceCombinationA6);
        g0.b(configType, configSize2, surfaceCombinationA7, configType, configSize3);
        surfaceCombinationA7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombinationA7);
        return arrayList;
    }

    public static List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationA.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize2, surfaceCombinationA, arrayList, surfaceCombinationA);
        g0.b(configType2, configSize, surfaceCombinationA2, configType2, configSize2);
        arrayList.add(surfaceCombinationA2);
        return arrayList;
    }

    public static List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize, surfaceCombinationA, arrayList, surfaceCombinationA);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationA3 = v0.a(configType3, configSize, surfaceCombinationA2, arrayList, surfaceCombinationA2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.s720p;
        g0.b(configType, configSize2, surfaceCombinationA3, configType3, configSize);
        SurfaceCombination surfaceCombinationA4 = y0.a(arrayList, surfaceCombinationA3);
        g0.b(configType2, configSize2, surfaceCombinationA4, configType3, configSize);
        SurfaceCombination surfaceCombinationA5 = y0.a(arrayList, surfaceCombinationA4);
        g0.b(configType, configSize2, surfaceCombinationA5, configType, configSize);
        SurfaceCombination surfaceCombinationA6 = y0.a(arrayList, surfaceCombinationA5);
        g0.b(configType, configSize2, surfaceCombinationA6, configType2, configSize);
        SurfaceCombination surfaceCombinationA7 = y0.a(arrayList, surfaceCombinationA6);
        g0.b(configType2, configSize2, surfaceCombinationA7, configType, configSize);
        SurfaceCombination surfaceCombinationA8 = y0.a(arrayList, surfaceCombinationA7);
        g0.b(configType2, configSize2, surfaceCombinationA8, configType2, configSize);
        arrayList.add(surfaceCombinationA8);
        return arrayList;
    }

    public static List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationA.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize2, surfaceCombinationA, arrayList, surfaceCombinationA);
        g0.b(configType2, configSize, surfaceCombinationA2, configType2, configSize2);
        SurfaceCombination surfaceCombinationA3 = y0.a(arrayList, surfaceCombinationA2);
        g0.b(configType, configSize, surfaceCombinationA3, configType, configSize);
        SurfaceCombination surfaceCombinationA4 = v0.a(SurfaceConfig.ConfigType.JPEG, configSize2, surfaceCombinationA3, arrayList, surfaceCombinationA3);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.VGA;
        g0.b(configType2, configSize3, surfaceCombinationA4, configType, configSize);
        SurfaceCombination surfaceCombinationA5 = v0.a(configType2, configSize2, surfaceCombinationA4, arrayList, surfaceCombinationA4);
        g0.b(configType2, configSize3, surfaceCombinationA5, configType2, configSize);
        surfaceCombinationA5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombinationA5);
        return arrayList;
    }

    public static List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize, surfaceCombinationA, arrayList, surfaceCombinationA);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA3 = v0.a(configType3, configSize, surfaceCombinationA2, arrayList, surfaceCombinationA2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        g0.b(configType, configSize2, surfaceCombinationA3, configType2, configSize);
        SurfaceCombination surfaceCombinationA4 = y0.a(arrayList, surfaceCombinationA3);
        g0.b(configType3, configSize2, surfaceCombinationA4, configType2, configSize);
        SurfaceCombination surfaceCombinationA5 = y0.a(arrayList, surfaceCombinationA4);
        g0.b(configType, configSize2, surfaceCombinationA5, configType, configSize2);
        SurfaceCombination surfaceCombinationA6 = y0.a(arrayList, surfaceCombinationA5);
        g0.b(configType, configSize2, surfaceCombinationA6, configType3, configSize2);
        SurfaceCombination surfaceCombinationA7 = y0.a(arrayList, surfaceCombinationA6);
        g0.b(configType, configSize2, surfaceCombinationA7, configType3, configSize2);
        surfaceCombinationA7.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombinationA7);
        return arrayList;
    }

    public static List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        SurfaceCombination surfaceCombinationA = v0.a(configType3, configSize3, surfaceCombination, arrayList, surfaceCombination);
        g0.b(configType, configSize, surfaceCombinationA, configType, configSize2);
        g0.b(SurfaceConfig.ConfigType.JPEG, configSize3, surfaceCombinationA, configType3, configSize3);
        arrayList.add(surfaceCombinationA);
        return arrayList;
    }

    public static List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationA.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize2, surfaceCombinationA, arrayList, surfaceCombinationA);
        g0.b(configType2, configSize, surfaceCombinationA2, configType2, configSize2);
        SurfaceCombination surfaceCombinationA3 = y0.a(arrayList, surfaceCombinationA2);
        g0.b(configType, configSize, surfaceCombinationA3, configType, configSize2);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationA4 = v0.a(configType3, configSize2, surfaceCombinationA3, arrayList, surfaceCombinationA3);
        g0.b(configType, configSize, surfaceCombinationA4, configType2, configSize2);
        SurfaceCombination surfaceCombinationA5 = v0.a(configType3, configSize2, surfaceCombinationA4, arrayList, surfaceCombinationA4);
        g0.b(configType2, configSize, surfaceCombinationA5, configType2, configSize);
        surfaceCombinationA5.addSurfaceConfig(SurfaceConfig.create(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombinationA5);
        return arrayList;
    }

    public static List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize, surfaceCombinationA, arrayList, surfaceCombinationA);
        surfaceCombinationA2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA3 = v0.a(configType3, configSize2, surfaceCombinationA2, arrayList, surfaceCombinationA2);
        g0.b(configType2, configSize, surfaceCombinationA3, configType3, configSize2);
        SurfaceCombination surfaceCombinationA4 = y0.a(arrayList, surfaceCombinationA3);
        g0.b(configType, configSize, surfaceCombinationA4, configType2, configSize2);
        SurfaceCombination surfaceCombinationA5 = y0.a(arrayList, surfaceCombinationA4);
        g0.b(configType2, configSize, surfaceCombinationA5, configType2, configSize2);
        SurfaceCombination surfaceCombinationA6 = y0.a(arrayList, surfaceCombinationA5);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
        g0.b(configType, configSize3, surfaceCombinationA6, configType, configSize);
        SurfaceCombination surfaceCombinationA7 = y0.a(arrayList, surfaceCombinationA6);
        g0.b(configType2, configSize3, surfaceCombinationA7, configType, configSize);
        SurfaceCombination surfaceCombinationA8 = y0.a(arrayList, surfaceCombinationA7);
        g0.b(configType, configSize3, surfaceCombinationA8, configType2, configSize);
        SurfaceCombination surfaceCombinationA9 = y0.a(arrayList, surfaceCombinationA8);
        g0.b(configType2, configSize3, surfaceCombinationA9, configType2, configSize);
        arrayList.add(surfaceCombinationA9);
        return arrayList;
    }

    public static List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        g0.b(configType2, configSize2, surfaceCombinationA, configType, configSize);
        SurfaceCombination surfaceCombinationA2 = y0.a(arrayList, surfaceCombinationA);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        g0.b(configType3, configSize2, surfaceCombinationA2, configType, configSize);
        SurfaceCombination surfaceCombinationA3 = y0.a(arrayList, surfaceCombinationA2);
        g0.b(configType2, configSize2, surfaceCombinationA3, configType2, configSize2);
        SurfaceCombination surfaceCombinationA4 = v0.a(configType, configSize, surfaceCombinationA3, arrayList, surfaceCombinationA3);
        g0.b(configType2, configSize2, surfaceCombinationA4, configType3, configSize2);
        SurfaceCombination surfaceCombinationA5 = v0.a(configType, configSize, surfaceCombinationA4, arrayList, surfaceCombinationA4);
        g0.b(configType3, configSize2, surfaceCombinationA5, configType3, configSize2);
        SurfaceCombination surfaceCombinationA6 = v0.a(configType, configSize, surfaceCombinationA5, arrayList, surfaceCombinationA5);
        surfaceCombinationA6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        g0.b(configType4, configSize, surfaceCombinationA6, configType, configSize);
        SurfaceCombination surfaceCombinationA7 = y0.a(arrayList, surfaceCombinationA6);
        g0.b(configType3, configSize2, surfaceCombinationA7, configType4, configSize);
        surfaceCombinationA7.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombinationA7);
        return arrayList;
    }

    public static List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize, 4L));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize, 4L));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination10);
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        arrayList.add(surfaceCombination11);
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination12);
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination13);
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination14);
        return arrayList;
    }

    public static List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA = v0.a(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        g0.b(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, surfaceCombinationA, configType, configSize);
        arrayList.add(surfaceCombinationA);
        return arrayList;
    }

    public static List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationA = v0.a(configType2, configSize3, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        g0.b(configType3, configSize, surfaceCombinationA, configType2, configSize2);
        SurfaceCombination surfaceCombinationA2 = v0.a(configType2, configSize3, surfaceCombinationA, arrayList, surfaceCombinationA);
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
        g0.b(configType4, configSize, surfaceCombinationA2, configType2, configSize2);
        SurfaceCombination surfaceCombinationA3 = v0.a(configType2, configSize3, surfaceCombinationA2, arrayList, surfaceCombinationA2);
        g0.b(configType, configSize, surfaceCombinationA3, configType2, configSize2);
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationA4 = v0.a(configType3, configSize4, surfaceCombinationA3, arrayList, surfaceCombinationA3);
        g0.b(configType3, configSize, surfaceCombinationA4, configType2, configSize2);
        SurfaceCombination surfaceCombinationA5 = v0.a(configType3, configSize4, surfaceCombinationA4, arrayList, surfaceCombinationA4);
        g0.b(configType4, configSize, surfaceCombinationA5, configType2, configSize2);
        SurfaceCombination surfaceCombinationA6 = v0.a(configType3, configSize4, surfaceCombinationA5, arrayList, surfaceCombinationA5);
        g0.b(configType, configSize, surfaceCombinationA6, configType2, configSize2);
        SurfaceCombination surfaceCombinationA7 = v0.a(configType, configSize4, surfaceCombinationA6, arrayList, surfaceCombinationA6);
        g0.b(configType3, configSize, surfaceCombinationA7, configType2, configSize2);
        SurfaceCombination surfaceCombinationA8 = v0.a(configType, configSize4, surfaceCombinationA7, arrayList, surfaceCombinationA7);
        g0.b(configType4, configSize, surfaceCombinationA8, configType2, configSize2);
        SurfaceCombination surfaceCombinationA9 = v0.a(configType, configSize4, surfaceCombinationA8, arrayList, surfaceCombinationA8);
        g0.b(configType, configSize, surfaceCombinationA9, configType2, configSize2);
        SurfaceCombination surfaceCombinationA10 = v0.a(configType4, configSize4, surfaceCombinationA9, arrayList, surfaceCombinationA9);
        g0.b(configType3, configSize, surfaceCombinationA10, configType2, configSize2);
        SurfaceCombination surfaceCombinationA11 = v0.a(configType4, configSize4, surfaceCombinationA10, arrayList, surfaceCombinationA10);
        g0.b(configType4, configSize, surfaceCombinationA11, configType2, configSize2);
        surfaceCombinationA11.addSurfaceConfig(SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombinationA11);
        return arrayList;
    }
}
