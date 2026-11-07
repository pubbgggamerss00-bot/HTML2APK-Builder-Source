package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ERSArchiveTimeStampGenerator {
    private final DigestCalculator digCalc;
    private byte[] previousChainHash;
    private List<ERSData> dataObjects = new ArrayList();
    private ERSRootNodeCalculator rootNodeCalculator = new BinaryTreeRootCalculator();

    public ERSArchiveTimeStampGenerator(DigestCalculator digestCalculator) {
        this.digCalc = digestCalculator;
    }

    private IndexedPartialHashtree[] getPartialHashtrees() {
        List<IndexedHash> listBuildIndexedHashList = ERSUtil.buildIndexedHashList(this.digCalc, this.dataObjects, this.previousChainHash);
        IndexedPartialHashtree[] indexedPartialHashtreeArr = new IndexedPartialHashtree[listBuildIndexedHashList.size()];
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 != this.dataObjects.size(); i10++) {
            if (this.dataObjects.get(i10) instanceof ERSDataGroup) {
                hashSet.add((ERSDataGroup) this.dataObjects.get(i10));
            }
        }
        for (int i11 = 0; i11 != listBuildIndexedHashList.size(); i11++) {
            byte[] bArr = listBuildIndexedHashList.get(i11).digest;
            ERSData eRSData = this.dataObjects.get(listBuildIndexedHashList.get(i11).order);
            if (eRSData instanceof ERSDataGroup) {
                List<byte[]> hashes = ((ERSDataGroup) eRSData).getHashes(this.digCalc, this.previousChainHash);
                indexedPartialHashtreeArr[i11] = new IndexedPartialHashtree(listBuildIndexedHashList.get(i11).order, (byte[][]) hashes.toArray(new byte[hashes.size()][]));
            } else {
                indexedPartialHashtreeArr[i11] = new IndexedPartialHashtree(listBuildIndexedHashList.get(i11).order, bArr);
            }
        }
        return indexedPartialHashtreeArr;
    }

    public void addAllData(List<ERSData> list) {
        this.dataObjects.addAll(list);
    }

    public void addData(ERSData eRSData) {
        this.dataObjects.add(eRSData);
    }

    public void addPreviousChains(ArchiveTimeStampSequence archiveTimeStampSequence) throws IOException {
        OutputStream outputStream = this.digCalc.getOutputStream();
        outputStream.write(archiveTimeStampSequence.getEncoded(ASN1Encoding.DER));
        outputStream.close();
        this.previousChainHash = this.digCalc.getDigest();
    }

    public ERSArchiveTimeStamp generateArchiveTimeStamp(TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        if (partialHashtrees.length != 1) {
            throw new ERSException("multiple reduced hash trees found");
        }
        byte[] bArrComputeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException("TSP response error status: " + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException("time stamp imprint for wrong algorithm");
        }
        if (Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), bArrComputeRootHash)) {
            return partialHashtrees[0].getValueCount() == 1 ? new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc) : new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), partialHashtrees, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc);
        }
        throw new ERSException("time stamp imprint for wrong root hash");
    }

    public List<ERSArchiveTimeStamp> generateArchiveTimeStamps(TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        byte[] bArrComputeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException("TSP response error status: " + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException("time stamp imprint for wrong algorithm");
        }
        if (!Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), bArrComputeRootHash)) {
            throw new ERSException("time stamp imprint for wrong root hash");
        }
        ContentInfo aSN1Structure2 = timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure();
        ArrayList arrayList = new ArrayList();
        if (partialHashtrees.length == 1 && partialHashtrees[0].getValueCount() == 1) {
            arrayList.add(new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, aSN1Structure2), this.digCalc));
            return arrayList;
        }
        ERSArchiveTimeStamp[] eRSArchiveTimeStampArr = new ERSArchiveTimeStamp[partialHashtrees.length];
        for (int i10 = 0; i10 != partialHashtrees.length; i10++) {
            eRSArchiveTimeStampArr[partialHashtrees[i10].order] = new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computePathToRoot(this.digCalc, partialHashtrees[i10], i10), aSN1Structure2), this.digCalc);
        }
        for (int i11 = 0; i11 != partialHashtrees.length; i11++) {
            arrayList.add(eRSArchiveTimeStampArr[i11]);
        }
        return arrayList;
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator) throws TSPException, IOException {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()));
    }

    public static class IndexedPartialHashtree extends PartialHashtree {
        final int order;

        private IndexedPartialHashtree(int i10, byte[] bArr) {
            super(bArr);
            this.order = i10;
        }

        private IndexedPartialHashtree(int i10, byte[][] bArr) {
            super(bArr);
            this.order = i10;
        }
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator, BigInteger bigInteger) throws TSPException, IOException {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()), bigInteger);
    }
}
