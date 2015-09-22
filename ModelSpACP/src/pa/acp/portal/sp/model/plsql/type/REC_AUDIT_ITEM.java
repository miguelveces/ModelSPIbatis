package pa.acp.portal.sp.model.plsql.type;

import java.sql.Timestamp;

import java.util.List;

/**
 *
 * @author lalince
 */
public class REC_AUDIT_ITEM implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String transaction_id;
    private Timestamp transaction_date;
    private String user_id;
    private String user_company;
    private String user_group;
    private String user_roles;
    private String source_ip_address;
    private String source_application;
    private String channel;
    private String language_code;
    private String service_name;
    private String service_operation;
    private String operation_type;
    private String biz_transaction_id;
    private String orchestration_step;
    private String page_size;
    private String page_number;
    private String sort_index;
    private String sort_type;
    private String compensation_indicator;
    private String operation_success;
    private List<REC_ERROR_MESSAGE> error_message;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Timestamp getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Timestamp transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_company() {
        return user_company;
    }

    public void setUser_company(String user_company) {
        this.user_company = user_company;
    }

    public String getUser_group() {
        return user_group;
    }

    public void setUser_group(String user_group) {
        this.user_group = user_group;
    }

    public String getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(String user_roles) {
        this.user_roles = user_roles;
    }

    public String getSource_ip_address() {
        return source_ip_address;
    }

    public void setSource_ip_address(String source_ip_address) {
        this.source_ip_address = source_ip_address;
    }

    public String getSource_application() {
        return source_application;
    }

    public void setSource_application(String source_application) {
        this.source_application = source_application;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_operation() {
        return service_operation;
    }

    public void setService_operation(String service_operation) {
        this.service_operation = service_operation;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getBiz_transaction_id() {
        return biz_transaction_id;
    }

    public void setBiz_transaction_id(String biz_transaction_id) {
        this.biz_transaction_id = biz_transaction_id;
    }

    public String getOrchestration_step() {
        return orchestration_step;
    }

    public void setOrchestration_step(String orchestration_step) {
        this.orchestration_step = orchestration_step;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getPage_number() {
        return page_number;
    }

    public void setPage_number(String page_number) {
        this.page_number = page_number;
    }

    public String getSort_index() {
        return sort_index;
    }

    public void setSort_index(String sort_index) {
        this.sort_index = sort_index;
    }

    public String getSort_type() {
        return sort_type;
    }

    public void setSort_type(String sort_type) {
        this.sort_type = sort_type;
    }

    public String getCompensation_indicator() {
        return compensation_indicator;
    }

    public void setCompensation_indicator(String compensation_indicator) {
        this.compensation_indicator = compensation_indicator;
    }

    public String getOperation_success() {
        return operation_success;
    }

    public void setOperation_success(String operation_success) {
        this.operation_success = operation_success;
    }

    public List<REC_ERROR_MESSAGE> getError_message() {
        return error_message;
    }

    public void setError_message(List<REC_ERROR_MESSAGE> error_message) {
        this.error_message = error_message;
    }

}
