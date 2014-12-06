package de.deltatree.tools.qrsct;

public enum QRSCTPurposeEnum {
	ACCT(
			"ACCT", "Cash Mgmt", "AccountManagement", "Transaction moves funds between 2 accounts of same account holder at the same bank."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CASH("CASH", "Cash Mgmt", "Cash management", "transfer"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	COLL(
			"COLL", "Cash Mgmt", "CollectionPayment", "Transaction is a collection of funds initiated via a credit transfer or direct debit."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	INTC(
			"INTC", "Cash Mgmt", "IntraCompanyPayment", "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LIMA(
			"LIMA", "Cash Mgmt", "LiquidityManagement", "Bank initiated account transfer to support zero target balance management, pooling or sweeping."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	NETT(
			"NETT", "Cash Mgmt", "Netting", "Transaction is related to a netting operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	AGRT(
			"AGRT", "Commercial", "Agricultural", "Payment Transaction pays for farm related and/or agricultural activities."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	BEXP(
			"BEXP", "Commercial", "BusinessExpenses", "Transaction is related to a payment of business expenses."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	COMC(
			"COMC", "Commercial", "CommercialPayment", "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit)"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CPYR(
			"CPYR", "Commercial", "Copyright", "Transaction is payment of copyright."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LICF(
			"LICF", "Commercial", "LicenseFee", "Transaction is payment of a license fee."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	GDDS(
			"GDDS", "Commercial", "PurchaseSaleOfGoods", "Transaction is related to purchase and sale of goods."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SCVE(
			"SCVE", "Commercial", "PurchaseSaleOfServices", "Transaction is related to purchase and sale of services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ROYA(
			"ROYA", "Commercial", "Royalties", "Transaction is the payment of royalties."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SUBS(
			"SUBS", "Commercial", "Subscription", "Transaction is related to a payment of information or entertainment services either in printed or electronic form."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SUPP(
			"SUPP", "Commercial", "SupplierPayment", "Transaction is related to a payment to a supplier."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	TRAD(
			"TRAD", "Commercial", "TradeServices", "Transaction is related to a trade services operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CHAR(
			"CHAR", "Consumer", "CharityPayment", "Transaction is a payment for charity reasons."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	COMT(
			"COMT", "Consumer", "ConsumerThirdPartyConsolidatedPayment", "Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CLPR(
			"CLPR", "Finance", "CarLoanRepayment", "Transaction is a payment of car loan payment (P&I)."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	GOVI(
			"GOVI", "Finance", "GovernmentInsurance", "Transaction is related to a payment of government insurance."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HLRP(
			"HLRP", "Finance", "HousingLoanRepayment", "Transaction is related to a payment of housing loan."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	INSU(
			"INSU", "Finance", "InsurancePremium", "Transaction is payment of an insurance premium."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	INTE("INTE", "Finance", "Interest", "Transaction is payment of interest."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LBRI(
			"LBRI", "Finance", "LaborInsurance", "Transaction is a payment of labor insurance."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LIFI(
			"LIFI", "Finance", "LifeInsurance", "Transaction is a payment of life insurance."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LOAN(
			"LOAN", "Finance", "Loan-General", "Transaction is related to a loan deposit or syndication operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LOAR(
			"LOAR", "Finance", "LoanRepayment", "Transaction is related to repayment of loan to lender."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PPTI(
			"PPTI", "Finance", "PropertyInsurance", "Transaction is a payment of property insurance."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	RINP(
			"RINP", "Finance", "RecurringInstallmentPayment", "Transaction is related to a payment of a recurring installment made at regular intervals."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	TRFD(
			"TRFD", "Finance", "TrustFund", "Transaction is related to a payment of a trust fund."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ADVA(
			"ADVA", "General", "Advance", "Payment Transaction is an advance payment."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CFEE(
			"CFEE", "General", "CancellationFee", "Transaction is related to a payment of cancellation fee."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	COST(
			"COST", "General", "Costs", "Transaction is related to payment of costs."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CCRD(
			"CCRD", "General", "Credit Card Payment", "Transaction is related to a payment of credit card account."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	DCRD("DCRD", "General", "Debit Card Payment", ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	GOVT(
			"GOVT", "General", "GovernmentPayment", "Transaction is a payment to or from a government department."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	INSM(
			"INSM", "General", "Installment", "Transaction is related to a payment of an installment."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	IHRP(
			"IHRP", "General", "InstalmentHirePurchaseAgreement", "Transaction is payment for an installment/hirepurchase agreement."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	MSVC(
			"MSVC", "General", "MultipleServiceTypes", "Transaction is related to a payment for multiple service types."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	NOWS(
			"NOWS", "General", "NotOtherwiseSpecified", "Transaction is related to a payment for type of services not specified elsewhere."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	OFEE(
			"OFEE", "General", "OpeningFee", "Transaction is related to a payment of opening fee."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	OTHR("OTHR", "General", "Other", "Other payment purpose."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PTSP(
			"PTSP", "General", "PaymentTerms", "Transaction is related to payment terms specifications"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PADD("PADD", "General", "Preauthorized", "debit Debit Origination"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	RCPT(
			"RCPT", "General", "ReceiptPayment", "Transaction is related to a payment of receipt."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	RENT("RENT", "General", "Rent", "Transaction is the payment of rent."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	STDY(
			"STDY", "General", "Study", "Transaction is related to a payment of study/tuition costs."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ANNI(
			"ANNI", "Investment", "Annuity", "Settles annuity related to credit, insurance, investments, other"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CMDT(
			"CMDT", "Investment", "Commodities", "Transaction is related to a commodities"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	DERI(
			"DERI", "Investment", "Derivatives", "Transaction is related to a derivatives transaction"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	DIVD(
			"DIVD", "Investment", "Dividend", "Transaction is payment of dividends."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	FREX(
			"FREX", "Investment", "ForeignExchange", "Transaction is related to a foreign exchange operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HEDG(
			"HEDG", "Investment", "Hedging", "Transaction is related to a hedging operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PRME(
			"PRME", "Investment", "PreciousMetal", "Transaction is related to a precious metal operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SAVG(
			"SAVG", "Investment", "Savings", "Transfer to savings/retirement account."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SECU(
			"SECU", "Investment", "Securities", "Transaction is related to a securities operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	TREA(
			"TREA", "Investment", "TreasuryPayment", "Transaction is related to treasury operations."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ANTS(
			"ANTS", "Medical", "AnesthesiaServices", "Transaction is a payment for anesthesia services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CVCF(
			"CVCF", "Medical", "ConvalescentCareFacility", "Transaction is a payment for convalescence care facility services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	DNTS(
			"DNTS", "Medical", "DentalServices", "Transaction is a payment for dental services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HLTI(
			"HLTI", "Medical", "HealthInsurance", "Transaction is a payment of health insurance."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HLTC(
			"HLTC", "Medical", "HomeHealthCare", "Transaction is a payment for home health care services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HSPC(
			"HSPC", "Medical", "HospitalCare", "Transaction is a payment for hospital care services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ICRF(
			"ICRF", "Medical", "IntermediateCareFacility", "Transaction is a payment for intermediate care facility services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	LTCF(
			"LTCF", "Medical", "LongTermCareFacility", "Transaction is a payment for long-term care facility services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	DMEQ(
			"DMEQ", "Medical", "MedicalEquipment", "Transaction is a payment is for use of durable medical equipment"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	MDCS(
			"MDCS", "Medical", "MedicalServices", "Transaction is a payment for medical care services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	VIEW(
			"VIEW", "Medical", "VisionCare", "Transaction is a payment for vision care services."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ALMY(
			"ALMY", "Salary & Benefits", "AlimonyPayment", "Transaction is the payment of alimony."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	BONU(
			"BONU", "Salary & Benefits", "BonusPayment", "Transaction is related to payment of a bonus."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	BECH(
			"BECH", "Salary & Benefits", "ChildBenefit", "Transaction is related to a payment made to assist parent/guardian to maintain child."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	COMM(
			"COMM", "Salary & Benefits", "Commission", "Transaction is payment of commission."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PENS(
			"PENS", "Salary & benefits", "PensionPayment", "Transaction is the payment of pension."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PRCP(
			"PRCP", "Salary & Benefits", "PricePayment", "Transaction is related to a payment of a price."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SALA(
			"SALA", "Salary & benefits", "SalaryPayment", "Transaction is the payment of salaries."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	SSBE(
			"SSBE", "Salary & benefits", "SocialSecurityBenefit", "Transaction is a social security benefit, ie payment made by a government to support individuals."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	BENE(
			"BENE", "Salary & benefits", "UnemploymentDisabilityBenefit", "Transaction is related to a payment to a person who is unemployed/disabled."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ESTX(
			"ESTX", "Tax", "EstateTax", "Transaction is related to a payment of estate tax."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	HSTX(
			"HSTX", "Tax", "HousingTax", "Transaction is related to a payment of housing tax."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	INTX(
			"INTX", "Tax", "IncomeTax", "Transaction is related to a payment of income tax."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	TAXS("TAXS", "Tax", "TaxPayment", "Transaction is the payment of taxes."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	VATX(
			"VATX", "Tax", "ValueAddedTaxPayment", "Transaction is the payment of value added tax."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	AIRB(
			"AIRB", "Transport", "Air", "Transaction settles air transport related obligations."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	BUSB(
			"BUSB", "Transport", "Bus", "Transaction settles air transport related obligations."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	FERB(
			"FERB", "Transport", "Ferry", "Transaction is a payment for ferry related business."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	RLWY(
			"RLWY", "Transport", "Railway", "Transaction is a payment for railway transport related business."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	CBTV(
			"CBTV", "Utilities", "CableTVBill", "Transaction is related to a payment of cable TV bill."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ELEC(
			"ELEC", "Utilities", "ElectricityBill", "Transaction is related to a payment of electricity bill."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	ENRG(
			"ENRG", "Utilities", "Energies", "Transaction is related to a utility operation."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	GASB(
			"GASB", "Utilities", "GasBill", "Transaction is related to a payment of gas bill."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	NWCH(
			"NWCH", "Utilities", "NetworkCharge", "Transaction is related to a payment of network charges."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	NWCM(
			"NWCM", "Utilities", "NetworkCommunication", "Transaction is related to a payment of network communication."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	OTLC(
			"OTLC", "Utilities", "OtherTelecomRelatedBill", "Transaction is related to a payment of other telecom related bill."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	PHON(
			"PHON", "Utilities", "TelephoneBill", "Transaction is related to a payment of telephone bill."), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	WTER(
			"WTER", "Utilities", "WaterBill", "Transaction is related to a payment of water bill."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

	public final static QRSCTPurposeEnum DEFAULT = QRSCTPurposeEnum.OTHR;

	private final String purposeId;
	private final String classification;
	private final String classificationName;
	private final String classificationDefinition;

	private QRSCTPurposeEnum(String purposeId, String classification,
			String classificationName, String classificationDefinition) {
		this.purposeId = purposeId;
		this.classification = classification;
		this.classificationName = classificationName;
		this.classificationDefinition = classificationDefinition;
	}

	public String getPurposeId() {
		return this.purposeId;
	}

	public String getClassification() {
		return this.classification;
	}

	public String getClassificationName() {
		return this.classificationName;
	}

	public String getClassificationDefinition() {
		return this.classificationDefinition;
	}
}
