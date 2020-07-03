package com.atish.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.atish.demo.entity.BaseAimdbrcnEntity;

/**
 * @author atishde
 * entity for REC_BALANCE_RESULT
 */
@Entity(name = "rec_balance_result")
public class RecBalanceResult extends BaseAimdbrcnEntity implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECORD_PK", unique = true, nullable = false, precision = 19)
	private long recordPk;
	@Column(name = "BASE_DATE", nullable = false, length = 10)
	private Date baseDate;
	@Column(name = "FUND_CD", nullable = false, length = 50)
	private String fundCd;
	@Column(name = "ASSET_TYPE_CD", nullable = false, length = 20)
	private String assetTypeCd;
	@Column(name = "SECURITY_CD_TICKER", length = 20)
	private String securityCdTicker;
	@Column(name = "SECURITY_CD_ISIN", length = 20)
	private String securityCdIsin;
	@Column(name = "SECURITY_CD_CUSIP", length = 20)
	private String securityCdCusip;
	@Column(name = "SECURITY_CD_FIGI", length = 12)
	private String securityCdFigi;
	@Column(name = "PRODUCT_CD", length = 2)
	private String productCd;
	@Column(name = "TRADE_CCY", length = 3)
	private String tradeCcy;
	@Column(name = "SETTLE_CCY", length = 3)
	private String settleCcy;
	@Column(name = "TRADE_DATE", length = 10)
	private Date tradeDate;
	@Column(name = "VALUE_DATE", length = 10)
	private Date valueDate;
	@Column(name = "SIDE", length = 1)
	private String side;
	@Column(name = "AMOUNT_BO", precision = 26, scale = 10)
	private BigDecimal amountBo;
	@Column(name = "AMOUNT_AIM", precision = 26, scale = 10)
	private BigDecimal amountAim;
	@Column(name = "AMOUNT_WITH_FACTOR_BO", precision = 26, scale = 10)
	private BigDecimal amountWithFactorBo;
	@Column(name = "AMOUNT_WITH_FACTOR_AIM", precision = 26, scale = 10)
	private BigDecimal amountWithFactorAim;
	@Column(name = "FACTOR", precision = 26, scale = 10)
	private BigDecimal factor;
	@Column(name = "FACTOR_UPD_DATE", length = 10)
	private Date factorUpdDate;
	@Column(name = "PRICE_BO", precision = 22, scale = 10)
	private BigDecimal priceBo;
	@Column(name = "PRICE_AIM", precision = 22, scale = 10)
	private BigDecimal priceAim;
	@Column(name = "FX_EXC_RATE_BO", precision = 26, scale = 10)
	private BigDecimal fxExcRateBo;
	@Column(name = "FX_EXC_RATE_AIM", precision = 26, scale = 10)
	private BigDecimal fxExcRateAim;
	@Column(name = "RECONCILE_REF_NO", nullable = false, length = 22)
	private String reconcileRefNo;
	@Column(name = "PRIORITY", nullable = false, length = 1)
	private String priority;
	@Column(name = "RESULT", nullable = false, length = 10)
	private String result;
	@Column(name = "DATA_SOURCE", nullable = false, length = 50)
	private String dataSource;
	@Column(name = "STATUS", nullable = false, length = 20)
	private String status;
	@Column(name="FACTOR_FLAG", length = 1)
	private String factorFlag;
	@Column(name = "EXPOSURE_AIM", precision = 26, scale = 10)
	private BigDecimal exposureAim;
	@Column(name = "EXPOSURE_BO", precision = 26, scale = 10)
	private BigDecimal exposureBo;
	/**
	 * @return the recordPk
	 */
	public long getRecordPk() {
		return recordPk;
	}

	/**
	 * @param recordPk
	 *            the recordPk to set
	 */
	public void setRecordPk(long recordPk) {
		this.recordPk = recordPk;
	}

	/**
	 * @return the baseDate
	 */
	public Date getBaseDate() {
		return baseDate;
	}

	/**
	 * @param baseDate
	 *            the baseDate to set
	 */
	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}

	/**
	 * @return the fundCd
	 */
	public String getFundCd() {
		return fundCd;
	}

	/**
	 * @param fundCd
	 *            the fundCd to set
	 */
	public void setFundCd(String fundCd) {
		this.fundCd = fundCd;
	}

	/**
	 * @return the assetTypeCd
	 */
	public String getAssetTypeCd() {
		return assetTypeCd;
	}

	/**
	 * @param assetTypeCd
	 *            the assetTypeCd to set
	 */
	public void setAssetTypeCd(String assetTypeCd) {
		this.assetTypeCd = assetTypeCd;
	}

	/**
	 * @return the securityCdTicker
	 */
	public String getSecurityCdTicker() {
		return securityCdTicker;
	}

	/**
	 * @param securityCdTicker
	 *            the securityCdTicker to set
	 */
	public void setSecurityCdTicker(String securityCdTicker) {
		this.securityCdTicker = securityCdTicker;
	}

	/**
	 * @return the securityCdIsin
	 */
	public String getSecurityCdIsin() {
		return securityCdIsin;
	}

	/**
	 * @param securityCdIsin
	 *            the securityCdIsin to set
	 */
	public void setSecurityCdIsin(String securityCdIsin) {
		this.securityCdIsin = securityCdIsin;
	}

	/**
	 * @return the securityCdCusip
	 */
	public String getSecurityCdCusip() {
		return securityCdCusip;
	}

	/**
	 * @param securityCdCusip
	 *            the securityCdCusip to set
	 */
	public void setSecurityCdCusip(String securityCdCusip) {
		this.securityCdCusip = securityCdCusip;
	}

	/**
	 * @return the securityCdFigi
	 */
	public String getSecurityCdFigi() {
		return securityCdFigi;
	}

	/**
	 * @param securityCdFigi
	 *            the securityCdFigi to set
	 */
	public void setSecurityCdFigi(String securityCdFigi) {
		this.securityCdFigi = securityCdFigi;
	}

	/**
	 * @return the productCd
	 */
	public String getProductCd() {
		return productCd;
	}

	/**
	 * @param productCd
	 *            the productCd to set
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	/**
	 * @return the tradeCcy
	 */
	public String getTradeCcy() {
		return tradeCcy;
	}

	/**
	 * @param tradeCcy
	 *            the tradeCcy to set
	 */
	public void setTradeCcy(String tradeCcy) {
		this.tradeCcy = tradeCcy;
	}

	/**
	 * @return the settleCcy
	 */
	public String getSettleCcy() {
		return settleCcy;
	}

	/**
	 * @param settleCcy
	 *            the settleCcy to set
	 */
	public void setSettleCcy(String settleCcy) {
		this.settleCcy = settleCcy;
	}

	/**
	 * @return the tradeDate
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * @param tradeDate
	 *            the tradeDate to set
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * @return the valueDate
	 */
	public Date getValueDate() {
		return valueDate;
	}

	/**
	 * @param valueDate
	 *            the valueDate to set
	 */
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	/**
	 * @return the side
	 */
	public String getSide() {
		return side;
	}

	/**
	 * @param side
	 *            the side to set
	 */
	public void setSide(String side) {
		this.side = side;
	}

	/**
	 * @return the amountBo
	 */
	public BigDecimal getAmountBo() {
		return amountBo;
	}

	/**
	 * @param amountBo
	 *            the amountBo to set
	 */
	public void setAmountBo(BigDecimal amountBo) {
		this.amountBo = amountBo;
	}

	/**
	 * @return the amountAim
	 */
	public BigDecimal getAmountAim() {
		return amountAim;
	}

	/**
	 * @param amountAim
	 *            the amountAim to set
	 */
	public void setAmountAim(BigDecimal amountAim) {
		this.amountAim = amountAim;
	}

	/**
	 * @return the amountWithFactorBo
	 */
	public BigDecimal getAmountWithFactorBo() {
		return amountWithFactorBo;
	}

	/**
	 * @param amountWithFactorBo
	 *            the amountWithFactorBo to set
	 */
	public void setAmountWithFactorBo(BigDecimal amountWithFactorBo) {
		this.amountWithFactorBo = amountWithFactorBo;
	}

	/**
	 * @return the amountWithFactorAim
	 */
	public BigDecimal getAmountWithFactorAim() {
		return amountWithFactorAim;
	}

	/**
	 * @param amountWithFactorAim
	 *            the amountWithFactorAim to set
	 */
	public void setAmountWithFactorAim(BigDecimal amountWithFactorAim) {
		this.amountWithFactorAim = amountWithFactorAim;
	}

	/**
	 * @return the factor
	 */
	public BigDecimal getFactor() {
		return factor;
	}

	/**
	 * @param factor
	 *            the factor to set
	 */
	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}

	/**
	 * @return the factorUpdDate
	 */
	public Date getFactorUpdDate() {
		return factorUpdDate;
	}

	/**
	 * @param factorUpdDate
	 *            the factorUpdDate to set
	 */
	public void setFactorUpdDate(Date factorUpdDate) {
		this.factorUpdDate = factorUpdDate;
	}

	/**
	 * @return the priceBo
	 */
	public BigDecimal getPriceBo() {
		return priceBo;
	}

	/**
	 * @param priceBo
	 *            the priceBo to set
	 */
	public void setPriceBo(BigDecimal priceBo) {
		this.priceBo = priceBo;
	}

	/**
	 * @return the priceAim
	 */
	public BigDecimal getPriceAim() {
		return priceAim;
	}

	/**
	 * @param priceAim
	 *            the priceAim to set
	 */
	public void setPriceAim(BigDecimal priceAim) {
		this.priceAim = priceAim;
	}

	/**
	 * @return the fxExcRateBo
	 */
	public BigDecimal getFxExcRateBo() {
		return fxExcRateBo;
	}

	/**
	 * @param fxExcRateBo
	 *            the fxExcRateBo to set
	 */
	public void setFxExcRateBo(BigDecimal fxExcRateBo) {
		this.fxExcRateBo = fxExcRateBo;
	}

	/**
	 * @return the fxExcRateAim
	 */
	public BigDecimal getFxExcRateAim() {
		return fxExcRateAim;
	}

	/**
	 * @param fxExcRateAim
	 *            the fxExcRateAim to set
	 */
	public void setFxExcRateAim(BigDecimal fxExcRateAim) {
		this.fxExcRateAim = fxExcRateAim;
	}

	/**
	 * @return the reconcileRefNo
	 */
	public String getReconcileRefNo() {
		return reconcileRefNo;
	}

	/**
	 * @param reconcileRefNo
	 *            the reconcileRefNo to set
	 */
	public void setReconcileRefNo(String reconcileRefNo) {
		this.reconcileRefNo = reconcileRefNo;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the dataSource
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the factorFlag
	 */
	public String getFactorFlag() {
		return factorFlag;
	}

	/**
	 * @param factorFlag the factorFlag to set
	 */
	public void setFactorFlag(String factorFlag) {
		this.factorFlag = factorFlag;
	}

	/**
	 * @return the exposureAim
	 */
	public BigDecimal getExposureAim() {
		return exposureAim;
	}

	/**
	 * @param exposureAim the exposureAim to set
	 */
	public void setExposureAim(BigDecimal exposureAim) {
		this.exposureAim = exposureAim;
	}

	/**
	 * @return the exposureBo
	 */
	public BigDecimal getExposureBo() {
		return exposureBo;
	}

	/**
	 * @param exposureBo the exposureBo to set
	 */
	public void setExposureBo(BigDecimal exposureBo) {
		this.exposureBo = exposureBo;
	}
}
